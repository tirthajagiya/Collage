using System.ComponentModel.DataAnnotations;

namespace SMS.Models
{
    public class StudentModel
    {
        public int? EnrollmentNo { get; set; }

        [Required]
        public string Name { get; set; }

        [Required, Phone]
        public string MobileNo { get; set; }

        public string Address { get; set; }

        [Required, EmailAddress]
        public string Email { get; set; }

        [Required]
        public string Gender { get; set; }

        [Required]
        public bool IsPlaingCricket { get; set; }

        [Required, StringLength(12, MinimumLength = 8)]
        public string Password { get; set; }

        [Required, Compare("Password", ErrorMessage = "Password and Confirm Password must be same.")]
        public string ConfirmPassword { get; set; }
        [Required]
        public decimal? TwelthPercentage { get; set; }

        [Required]
        public bool IsLiveInRajkot { get; set; }

        public DateTime? CreatedDate { get; set; }

    }
}
