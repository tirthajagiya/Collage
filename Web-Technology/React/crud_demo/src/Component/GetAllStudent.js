import { useState } from "react";
import { Link } from "react-router-dom";

export default function GetAllStudent() {
    const [data, setData] = useState([]);
    const apiUrl = "http://localhost:3000/student";
    fetch(apiUrl)
        .then(res => res.json())
        .then(res => setData(res));

    const formatedStudent = data.map((student) => {
        return (
            <>
                <tr>
                    <td>{student.id}</td>
                    {/* <td>{student.createdAt}</td> */}
                    <td>{student.name}</td>
                    {/* <td>{student.avatar}</td> */}
                    <td>
                        <Link className="bg-primary" to={"/student/" + student.id}>Read More</Link>
                        <Link className="bg-primary" to={"/student/edit/" + student.id}>Edit</Link>
                    </td>
                </tr>
            </>
        );
    });
    return (
        <>
            <h5>
                <Link className="btn btn-info" to="/student/add">Add Student</Link>
            </h5>
            <table className="table">
                {formatedStudent}
            </table>
        </>
    );
}