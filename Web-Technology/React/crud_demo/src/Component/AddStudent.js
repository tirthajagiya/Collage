import { useEffect, useState } from "react";
import { json, useNavigate } from "react-router-dom";

export default function AddStudent() {
    const [data, setData] = useState();
    const navigate = useNavigate();

    return (
        <>
            <div class="form-group row">
                <label for="text2" class="col-4 col-form-label">CreatedAt</label>
                <div class="col-8">
                    <input id="text2" name="text2" onChange={(e) => {
                        setData({ ...data, createdAt: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text" class="col-4 col-form-label">Name</label>
                <div class="col-8">
                    <input id="text" name="text" onChange={(e) => {
                        setData({ ...data, name: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="text1" class="col-4 col-form-label">Avatar</label>
                <div class="col-8">
                    <input id="text1" name="text1" onChange={(e) => {
                        setData({ ...data, avatar: e.target.value });
                    }} type="text" class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <div class="offset-4 col-8">
                    <button class="btn btn-primary" onClick={() => {
                        const apiUrl = "http://localhost:3000/student";
                        fetch(apiUrl, {
                            method: "POST",
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