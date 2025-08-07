import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";

export default function DetailStudent() {
    const [data, setData] = useState({});
    const { id } = useParams();
    const navigate = useNavigate();

    const apiUrl = "http://localhost:3000/student/" ;

    useEffect(() => {
        fetch(apiUrl)
            .then(res => res.json())
            .then(res => setData(res));
    }, [])
    return (
        <>
            <Link className="btn btn-primary" to={"/student"}>Back</Link>
            <button className="btn btn-danger" onClick={() => {
                const apiUrl = "http://localhost:3000/student/" + id;

                fetch(apiUrl, {
                    method: "DELETE"
                })
                    .then(res => res.json())
                    .then(res => navigate("/student"));
            }}>Delete</button>
            <h4>Id:{data.id}</h4>
            <img src={data.avatar} />
            <p>Name:{data.name}</p>
            <p>CreatedAt:{data.createdAt}</p>
            Hello
        </>
    );
}