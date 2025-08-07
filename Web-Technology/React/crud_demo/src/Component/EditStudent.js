import { useState,useEffect } from "react";
import { useParams, useNavigate } from "react-router-dom";

export default function EditStudent() {
    const [data, setData] = useState({});
    const navigate = useNavigate();
    const { id } = useParams();

    const apiUrl = "http://localhost:3000/student/" + id;

    useEffect(() => {
        fetch(apiUrl)
            .then(res => res.json())
            .then(res => setData(res));
    }, []);
    return (
        <>
            <div class="form-group row">
                <label for="text2" class="col-4 col-form-label">CreatedAt</label>
                <div class="col-8">
                    <input id="text2" value={data.createdAt} name="text2" onChange={(e) => {
                        setData({ ...data, createdAt: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text" class="col-4 col-form-label">Name</label>
                <div class="col-8">
                    <input id="text" value={data.name} name="text" onChange={(e) => {
                        setData({ ...data, name: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text1" class="col-4 col-form-label">Avatar</label>
                <div class="col-8">
                    <input id="text1" value={data.avatar} name="text1" onChange={(e) => {
                        setData({ ...data, avatar: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <div class="offset-4 col-8">
                    <button class="btn btn-primary" onClick={() => {
                        const apiUrl = "http://localhost:3000/student/" + id;
                        fetch(apiUrl, {
                            method: "PATCH",
                            body: JSON.stringify(data),
                            headers: {
                                "Content-Type": "application/json"
                            }
                        })
                            .then(res => res.json())
                            .then(res => navigate("/student"));
                    }}>Submit</button>   
                </div>
            </div>
        </>
    );
}