using Microsoft.AspNetCore.Mvc;
using SMS.Models;
using System.Data;
using System.Data.SqlClient;

namespace SMS.Controllers
{
    public class StudentController : Controller
    {
        private readonly IConfiguration configuration;

        public StudentController(IConfiguration Configuration)
        {
            configuration = Configuration;
        }
        public IActionResult StudentList()
        {
            string connectionString = configuration.GetConnectionString("ConnectionString");

            SqlConnection connection = new SqlConnection(connectionString);
            connection.Open();

            SqlCommand command = connection.CreateCommand();
            command.CommandType = CommandType.Text;
            command.CommandText = "PR_Stu_Select_All";

            SqlDataReader reader = command.ExecuteReader();
            DataTable dataTable = new DataTable();
            dataTable.Load(reader);

            return View(dataTable);
        }

        public IActionResult StudentDelete(int EnrollmentNo)
        {
            try
            {
                string connectionString = configuration.GetConnectionString("ConnectionString");
                using (SqlConnection connection = new SqlConnection(connectionString))
                {
                    connection.Open();

                    using (SqlCommand command = new SqlCommand("PR_Stu_Delete", connection))
                    {
                        command.CommandType = CommandType.StoredProcedure;
                        command.Parameters.AddWithValue("@EnrollmentNo", EnrollmentNo);

                        command.ExecuteNonQuery();
                    }
                }

            }
            catch (Exception ex)
            {
                TempData["ErrorMessage"] = "An error occurred while deleting the student: " + ex.Message;
            }

            return RedirectToAction("StudentList");
        }


        public IActionResult StudentAddEdit(StudentModel model)
        {
            if (ModelState.IsValid)
            {
                string connectionString = configuration.GetConnectionString("ConnectionString");
                SqlConnection connection = new SqlConnection(connectionString);
                connection.Open();

                SqlCommand command = connection.CreateCommand();
                command.CommandType = CommandType.StoredProcedure;

                if (model.EnrollmentNo == null || model.EnrollmentNo == 0)
                {
                    command.CommandText = "PR_Stu_Insert";
                }
                else
                {
                    command.CommandText = "PR_Stu_Update";
                    command.Parameters.Add("@EnrollmentNo", SqlDbType.Int).Value = model.EnrollmentNo;
                }
                command.Parameters.Add("@Name", SqlDbType.VarChar).Value = model.Name;
                command.Parameters.Add("@MobileNo", SqlDbType.VarChar).Value = model.MobileNo;
                command.Parameters.Add("@Address", SqlDbType.VarChar).Value = model.Address;
                command.Parameters.Add("@Email", SqlDbType.VarChar).Value = model.Email;
                command.Parameters.Add("@Gender", SqlDbType.VarChar).Value = model.Gender;
                command.Parameters.Add("@Password", SqlDbType.VarChar).Value = model.Password;
                command.Parameters.Add("@IsPlaingCricket", SqlDbType.Bit).Value = model.IsPlaingCricket;
                command.Parameters.Add("@TwelthPercentage", SqlDbType.Decimal).Value = model.TwelthPercentage;
                command.Parameters.Add("@IsLiveInRajkot", SqlDbType.Bit).Value = model.IsLiveInRajkot;

                command.ExecuteNonQuery();
                return RedirectToAction("StudentList");
            }

            return View("StudentForm", model);
        }

        public IActionResult StudentForm(int? EnrollmentNo)
        {
            if (EnrollmentNo == null)
            {
                ViewBag.Title = "Add Student";
                var m = new StudentModel
                {
                    CreatedDate = DateTime.Now
                };
                return View(m);
            }

            string connectionString = configuration.GetConnectionString("ConnectionString");
            SqlConnection connection = new SqlConnection(connectionString);
            connection.Open();

            SqlCommand command = connection.CreateCommand();
            command.CommandType = CommandType.StoredProcedure;
            command.CommandText = "PR_Stu_Select_By_Id";

            command.Parameters.AddWithValue("@EnrollmentNo", EnrollmentNo);

            SqlDataReader reader = command.ExecuteReader();
            DataTable table = new DataTable();
            table.Load(reader);

            StudentModel model = new StudentModel();

            foreach (DataRow dataRow in table.Rows)
            {
                model.EnrollmentNo = Convert.ToInt32(dataRow["EnrollmentNo"]);
                model.Name = dataRow["Name"].ToString();
                model.MobileNo = dataRow["MobileNo"].ToString();
                model.Address = dataRow["Address"].ToString();
                model.Email = dataRow["Email"].ToString();
                model.Gender = dataRow["Gender"].ToString();
                model.IsPlaingCricket = (bool)dataRow["IsPlaingCricket"];
                model.Password = dataRow["Password"].ToString();
                model.TwelthPercentage = (Decimal)dataRow["TwelthPercentage"];
                model.IsLiveInRajkot = (bool)dataRow["IsLiveInRajkot"];
                model.CreatedDate = (DateTime)dataRow["CreatedDate"];
            }

            ViewBag.Title = "Edit Student";
            return View(model);
        }
    }
}
