using ClosedXML.Excel;
using Microsoft.AspNetCore.Mvc;

[Route("ExportToExcel")]

namespace Hospital_Management_System.Controllers
{
    public class StateController : Controller
    {
        [Route("ExportToExcel")]
        public IActionResult ExportToExcel()
        {
            DataTable dt = RetrieveData("PR_LOC_State_SelectAll");

            using (var workbook = new XLWorkbook())
            {
                // Add the DataTable to a worksheet
                workbook.Worksheets.Add(dt, "States");

                using (var stream = new MemoryStream())
                {
                    workbook.SaveAs(stream);
                    var content = stream.ToArray();

                    return File(
                        content,
                        "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
                        "States.xlsx"
                    );
                }
            }
        }
    }
}
