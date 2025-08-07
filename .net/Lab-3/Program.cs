using System;

namespace Lab_3{
    class Program
    {
        public static void Main(String[] args)
        {
            //divideByZeroExeption divideByZeroExeption = new divideByZeroExeption();
            //divideByZeroExeption.HandleExeption(40, 0);

            //indexOutOfBound indexOutOfBound = new indexOutOfBound();
            //indexOutOfBound.takeInupt();

            //Sum sum = new Sum();

            Calculate calculate = new Calculate();
            Console.Write(calculate.sumOfTwo(10, 5));
            Console.Write(calculate.sumOfThree(10, 2, 3));

        }
    }
}