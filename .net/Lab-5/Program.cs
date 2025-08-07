using System;
using System.Collections;

class Program
{
    public static void Main(String[] args)
    {

        //ArrayList

        ArrayList arrayList = new ArrayList();
        arrayList.Add(10);
        arrayList.Add(2);
        arrayList.Add(3);
        //arrayList.Remove(1);
        //arrayList.RemoveRange(0, 3);
        //arrayList.Clear();
        arrayList.Sort();

        for (int i = 0; i < arrayList.Count; i++)
        {
            Console.WriteLine(arrayList[i]);
        }

        //List

        //List <String> StudentName = new List <String> ();

        //StudentName.Add("XYZ");
        //StudentName.Add("ABC");
        //StudentName.Add("PQR");
        //StudentName.Add("DEF");
        ////StudentName.Remove("ABC");
        ////StudentName.RemoveRange(1, 2);
        //StudentName.Clear();

        //for (int i = 0; i < StudentName.Count; i++)
        //{
        //    Console.WriteLine(StudentName[i]);
        //}

        //Stack

        //Stack<int> integers = new Stack<int>();
        //integers.Push(1);
        //integers.Push(10);
        //integers.Push(100);
        //integers.Push(1000);
        //integers.Pop();
        ////Console.WriteLine(integers.Peek());
        ////Console.WriteLine(integers.Contains(1));
        //integers.Clear();
        //foreach(int item in integers)
        //{
        //    Console.WriteLine(item);
        //}

        //Queue

        //Queue queue = new Queue(); 
        //queue.Enqueue(1);
        //queue.Enqueue("ABC");
        //queue.Enqueue(queue.Count);
        ////queue.Dequeue();
        //Console.WriteLine(queue.Peek());
        //Console.WriteLine(queue.Contains("AXZ"));
        //queue.Clear();
        //foreach (var i in queue)
        //{
        //    Console.WriteLine(i);
        //}

        //Dictionary

        //Dictionary<int, string> dic = new Dictionary<int, string>();
        //dic.Add(101, "A");
        //dic.Add(102, "B");
        //dic.Add(103, "C");
        //dic.Remove(102);
        //Console.WriteLine(dic.ContainsKey(102));
        //Console.WriteLine(dic.ContainsValue("C"));\
        //dic.Clear();

        //foreach(var d in dic)
        //{
        //    Console.WriteLine(d);
        //}


    }
}