using HospitalManagementSystem.Models;
using Microsoft.AspNetCore.Mvc;
using System.Data;
using System.Data.SqlClient;


namespace HospitalManagementSystem.Controllers
{
    public class UserController : Controller
    {
        #region Config
        private IConfiguration configuration;
        
        public UserController(IConfiguration _configuration)
        {
            configuration = _configuration;
        }
        #endregion

        #region UserList
        public IActionResult UserList()
        {
            string connectionString = this.configuration.GetConnectionString("ConnectionString");
            SqlConnection connection = new SqlConnection(connectionString);
            connection.Open();
            SqlCommand command = connection.CreateCommand();
            command.CommandType = CommandType.StoredProcedure;
            command.CommandText = "PR_User_SelectAll";
            SqlDataReader reader = command.ExecuteReader();
            DataTable table = new DataTable();
            table.Load(reader);
            return View(table);
        }
        #endregion

        #region UserAddEdit
        public IActionResult UserAddEdit(UserModel userModel)
        {
            if (ModelState.IsValid) {
                string connectionString = this.configuration.GetConnectionString("ConnectionString");
                SqlConnection connection = new SqlConnection(connectionString);
                connection.Open();
                SqlCommand command = connection.CreateCommand();
                command.CommandType = CommandType.StoredProcedure;
                if (userModel.UserID == null)
                {
                    command.CommandText = "PR_User_Insert";
                }
                else
                {
                    command.CommandText = "PR_User_Update";
                    command.Parameters.Add("@UserID", SqlDbType.Int).Value = userModel.UserID;
                }
                command.Parameters.Add("@UserName", SqlDbType.VarChar).Value = userModel.UserName;
                command.Parameters.Add("@Password", SqlDbType.VarChar).Value = userModel.Password;
                command.Parameters.Add("@Email", SqlDbType.VarChar).Value = userModel.Email;
                command.Parameters.Add("@MobileNo", SqlDbType.VarChar).Value = userModel.MobileNo;
                command.Parameters.Add("@IsActive", SqlDbType.Bit).Value = userModel.IsActive;
                command.ExecuteNonQuery();
                return RedirectToAction("UserList");
            }
            return View("UserAddEdit");
        }
        #endregion

        #region UserDelete
        public IActionResult UserDelete(int UserID)
        {
            string connectionString = this.configuration.GetConnectionString("ConnectionString");
            SqlConnection connection = new SqlConnection(connectionString);
            connection.Open();
            SqlCommand command = connection.CreateCommand();
            command.CommandType = CommandType.StoredProcedure;
            command.CommandText = "PR_User_Delete";
            command.Parameters.Add("@UserID", SqlDbType.VarChar).Value = UserID;
            command.ExecuteNonQuery();
            return RedirectToAction("UserList");
        }

        #endregion

        public IActionResult SetFieldValue(int UserID)
        {
            string connectionString = this.configuration.GetConnectionString("ConnectionString");
            SqlConnection connection = new SqlConnection(connectionString);
            connection.Open();
            SqlCommand command = connection.CreateCommand();
            command.CommandType = CommandType.StoredProcedure;
            command.CommandText = "PR_User_SelectByID";
            command.Parameters.AddWithValue("@UserID", UserID);

                    SqlDataReader reader = command.ExecuteReader();

                    DataTable table = new DataTable();

                    table.Load(reader);
                      UserModel model = new UserModel();
                    foreach (DataRow row in table.Rows)
                    {
                        model.UserID = Convert.ToInt32(row["UserID"]);
                        model.UserName = row["UserName"].ToString();
                        model.Password = row["Password"].ToString();
                        model.Email = row["Email"].ToString();
                        model.MobileNo = row["MobileNo"].ToString();
                        model.IsActive = Convert.ToBoolean(row["IsActive"]);
                        model.Created = Convert.ToDateTime(row["Created"]);
                        model.Modified = Convert.ToDateTime(row["Modified"]);
                        
                    }

                    return View("UserAddEdit", model);
        }
    }
    }