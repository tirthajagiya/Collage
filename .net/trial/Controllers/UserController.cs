using Microsoft.AspNetCore.Mvc;
using trial.Models;

namespace trial.Controllers
{
    public class UserController : Controller
    {
        public IActionResult UserAddEdit(IFormCollection fc)
        {
            ViewData["name"] = fc["name"];
            ViewData["email"] = fc["email"];
            return View();
        }
    }
}