using Hospital_Management_System.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using System.Data;
using System.Data.SqlClient;

namespace Hospital_Management_System.Controllers
{
    public class DashboardController : Controller
    {
        private readonly string _connectionString;
        public DashboardController(IConfiguration configuration)
        {
            _connectionString = configuration.GetConnectionString("ConnectionString");
        }
        public IActionResult Index ()
        {
            DashboardModel stats = GetDashboardStats();
            return View("Dashboard", stats);
        }




        

        public IActionResult GetStatics()
        {
            DashboardModel stats = GetDashboardStats();
            return View(stats);
        }

        // Simplified method to get only essential totals
        public DashboardModel GetDashboardStats()
        {
            DashboardModel stats = new DashboardModel();

            using (SqlConnection con = new SqlConnection(_connectionString))
            using (SqlCommand cmd = new SqlCommand("PR_Dashboard_GetStatics", con))
            {
                cmd.CommandType = CommandType.StoredProcedure;
                con.Open();

                SqlDataReader reader = cmd.ExecuteReader();
                if (reader.Read())
                {
                    stats.TotalUsers = Convert.ToInt32(reader["TotalUsers"]);
                    stats.TotalDoctors = Convert.ToInt32(reader["TotalDoctors"]);
                    stats.TotalAppointments = Convert.ToInt32(reader["TotalAppointments"]);
                }
            }

            return stats;
        }


    }

}
