﻿using Microsoft.AspNetCore.Mvc;

namespace HospitalManagementSystem.Controllers
{
    public class UserController : Controller
    {
        public IActionResult UserList()
        {
            return View();
        }
    }
}