import { Component, useEffect, useState } from "react";
import { BrowserRouter, Link, Outlet, Route, Routes } from 'react-router-dom';

function Header(props) {
    // let temp = "";
    // let by = props.by;
    // return (
    // for(let i=0;i<props.props;i++) {
    //     temp += by
    // }
    // {props.by == "undifined" && <button>X</button>}
    // {!props.by == "undifined" && <h2>{temp}</h2>}
    // );
    // return (
    //     <h2>Header</h2>
    // );
    return(
        <>
            <h2>Header</h2>
        </>
    )
}
function Footer() {
    return (<h2>Footer</h2>);
}

function Form2(props) {
    return (
        <table>
            <tr>
                <td>
                    <label>Username : </label>
                </td>
                <td>
                    <input type="text"></input>
                </td>
            </tr>

            <tr>
                <td>
                    <label>Password : </label>
                </td>
                <td>
                    <input type="text"></input>
                </td>
            </tr>
            <tr>
                <td>
                    {props.add == "true" && <button>Add</button>}
                    {props.add == "false" && <button>Edit</button>}
                </td>
            </tr>
        </table>
    );
}

function Faculty() {
    const faculty = [
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        },
        {
            Name: "Arjun",
            Image: "./images.jpeg",
            Experience: "10 Year",
            Department: "Computer"
        }
    ];

    const mapfaculty = faculty.map((stu) => {
        return (
            <div className="col-3">
                <div className="card m-2">
                    <img src={'https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/15---28-04-2023-02-07-35.jpg'} className="card-img-top" alt="..." />
                    <div className="card-body">
                        <h3>{stu.Name}</h3>
                        <h6>{stu.Department}</h6>
                        <p className="card-text">{stu.Experience}</p>
                    </div>
                </div>
            </div>
        );
    })

    return (
        <div className="conatiner">
            <div className="row">
                {mapfaculty}
            </div>
        </div>
    );
}

function Home() {
    return (<h2>Home</h2>);
}
function Contact() {
    return (<h2>Contact</h2>);
}

function About() {
    return (<h2>About</h2>);
}

class Student extends Component {
    render() {
        return (<h2>Hello</h2>);
    }
}

function Admin(isValid) {
    return (
        {}
    );
}

function Layout() {
    let faculty = [
        "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/336---28-04-2023-01-34-37.jpg",
        "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/12---28-04-2023-02-06-51.jpg",
        "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/13---28-04-2023-02-07-48.jpg"
    ];
    let [countState, setcountState] = useState(0);
    return (
        <>
            <div className='container'>
                <div className='row'>
                    <div className='col border border-danger me-3 mb-3'>
                        <Link to='/home' style={{color:"red", textDecoration:"none"}}>Home</Link>&nbsp;
                        <Link to='/contact'>Contact</Link>&nbsp;
                        <Link to='/about'>About</Link>
                    </div>
                </div>
                <div className='row mb-3' style={{ height: "200px" }}>
                    <div className='col-3 border border-primary me-3'>
                        Sidebar
                    </div>
                    <div className='col border border-secondary me-3'>
                        <Outlet />
                        {countState != 0 && <button onClick={() => {
                            // if (countState == 0) {
                            //     setcountState(faculty.length - 1);
                            // }
                            // else {
                            setcountState(countState - 1);
                            // }
                        }}>
                            Prev
                        </button>}
                        {countState != faculty.length - 1 && <button onClick={() => {
                            // if (countState == (faculty.length - 1)) {
                            //     setcountState(0);
                            // }
                            // else {
                            setcountState(countState + 1);
                            // }
                        }}>
                            Next
                        </button>}
                        <br />
                        <img src={faculty[countState]} style={{ width: "100px" }}></img>
                    </div>
                </div>
                <div className='row'>
                    <div className='col border border-danger me-3'>
                        Footer
                    </div>
                </div>
            </div>
        </>
    );
}

function RouteDemo() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route path="/home" element={<Home />} />
                    <Route path="/contact" element={<Contact />} />
                    <Route path="/about" element={<About />} />
                </Route>
                <Route path="/*" element={<h5>404,Page Not Found</h5>} />
            </Routes>
        </BrowserRouter>
    );
}

function IncremantButton() {
    setInterval(ForHello, 1000);
    let [count, setCount] = useState(0);
    return (
        <>
            {count}
            <br />
            <button onClick={() => {
                count++;
                setCount(count);
            }}>Incremant</button>
        </>
    );
}

function ForHello() {
    return (
        <>
            <h4>
                Hello
            </h4>
        </>
    );
}

function Forms() {
    const [data, setData] = useState({ name: "a", password: "b" });
    return (
        <>
            <div style={{ border: "1px solid black", height: 50, width: 500, float: "left" }} >
                <input type="text" placeholder="Enter A Name" onChange={(e) => {
                    setData({ ...data, name: e.target.value });
                }} />
                <input type="password" placeholder="Enter A Password" onChange={(e) => {
                    setData({ ...data, password: e.target.value });
                }} />
            </div>
            <div style={{ border: "1px solid red", height: 50, width: 500, float: "left" }}>
                <h2>
                    Name={data.name}
                    <br />
                    Password={data.password}
                </h2>
            </div>
        </>
    );
}

function DisplayStudentData() {

    const [student, setStudent] = useState([]);

    const apiUrl = "https://66ee8cc33ed5bb4d0bf144d5.mockapi.io/StudentData/Student";

    useEffect(() => {
        fetch(apiUrl, { method: "GET" })
            .then(res => res.json())
            .then(res => setStudent(res));
    }, [])

    const fomatedStudent = student.map((stu) => {
        return (
            <>
                <div className="col-4">
                    <div class="card">
                        <div class="card-header">
                            CreatedAt : &nbsp;{stu.createdAt}
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">Name : &nbsp;{stu.name}</li>
                            <li class="list-group-item"><img src={stu.avatar} /></li>
                            <li class="list-group-item">Id : &nbsp;{stu.id}</li>
                        </ul>
                    </div>
                </div>
            </>
        );
    }
    );

    return (
        <>
            <div className="container">
                <div className="row">
                    {fomatedStudent}
                </div>
            </div>
        </>
    );
}

function LabCrud() {

    let [student, setStudent] = useState(["arjun", "bala", "darshan"]);
    let [name, setName] = useState();

    function addStudent(name) {
        setStudent([...student, name]);
        setName();
    }

    return (
        <>
            <input type="text" placeholder="Enter A Student Name" onChange={(e) => {
                name = e.target.value;
            }} />
            <button onClick={addStudent(name)}>Add</button>
            {student.map((stu) => {
                return (
                    <li>{stu}</li>
                );
            })}
        </>
    );
}
export { Faculty, Header, Footer, Home, Contact, About, Student, Admin, Layout, IncremantButton, ForHello, Forms, DisplayStudentData, RouteDemo , Form2 , LabCrud };