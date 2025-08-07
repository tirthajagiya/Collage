function openform() {
    let temp = '';
    temp += '<div id="formbox">';
    temp += '    <div id="form">';
    temp += '        <label for="name">Name:</label>';
    temp += '        <input type="text" placeholder="Enter An Event Name Here!" id="name">';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="date">Date:</label>';
    temp += '        <input type="date" id="date">';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="time">Time:</label>';
    temp += '        <input type="time" id="time">';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="location">Location:</label>';
    temp += '        <input type="text" placeholder="Enter A Location Here!" id="location">';
    temp += '    </div>';
    temp += '    <div class="button-container" id="form">';
    temp += '        <button onclick="add()" style="height:40px">Add</button>';
    temp += '        <button class="btn-cancel" onclick="cancel()" style="height:40px">Cancel</button>';
    temp += '    </div>';
    temp += '</div>';

    temp += "<hr>";

    document.getElementById('addItem').innerHTML = temp;
}




function cancel() {
    document.getElementById('addItem').innerHTML = "";
}
function add() {
    document.getElementById('name').style = "border: 1px solid blue";
    document.getElementById('date').style = "border: 1px solid blue";
    document.getElementById('time').style = "border: 1px solid blue";
    document.getElementById('location').style = "border: 1px solid blue"
    const newname = document.getElementById('name').value;
    const newdate = document.getElementById('date').value;
    const newtime = document.getElementById('time').value;
    const newlocation = document.getElementById('location').value;
    if (newname && newdate && newtime && newlocation) {
        document.getElementById('addItem').innerHTML = "";
        arr.push({
            name: newname,
            date: newdate,
            time: newtime,
            location: newlocation
        });
        Swal.fire({
            title: "Event Added !",
            text: "You Can Check Event !",
            icon: "success"
        });
        displayEvent();
    }
    else {
        Swal.fire({
            icon: "error",
            title: "Please Enter A All Field For Better Experience",
            text: "Something went wrong!",
          });
    }
}
let arr = [];
function displayEvent() {
    let tempString = "";
    for (i = 0; i < arr.length; i++) {
        // temp2+='<div class="card" style="width: 18rem;"><div class="card-body"><h5 class="card-title">' + name + '</h5><h6 class="card-subtitle mb-2 text-body-secondary">' + date + '</h6><h6 class="card-subtitle mb-2 text-body-secondary">' + time + '</h6><p>' + location + '</p><button onClick="deleteEvent('+arrayIndex+')">Delete</button></div></div>'
        tempString += '<div id="box">'
        tempString += '<h3>' + arr[i].name + '</h3>'
        tempString += '<p>' + arr[i].date + '</p>'
        tempString += '<p>' + arr[i].time + '</p>'
        tempString += '<p>' + arr[i].location + '</p>'
        tempString += '<button onClick="deleteEvent(' + i + ')"><i class="fa-solid fa-trash"></i></button>'
        tempString += '<button onClick="editEvent(' + i + ')" style="margin-left:10px"><i class="fa-regular fa-pen-to-square"></i></button>'
        tempString += '</div>'
        document.getElementById('addEvent').innerHTML = tempString;
    }

}

function deleteEvent(id) {
    Swal.fire({
        title: "Are you sure?",
        text: "You won't be able to revert this!",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Yes, delete it!"
    }).then((result) => {
        if (result.isConfirmed) {
            Swal.fire({
                title: "Deleted!",
                text: "Your Event has been deleted.",
                icon: "success"
            });
            arr.splice(id, 1);
            document.getElementById('addEvent').innerHTML = "";
            displayEvent();
        }
    });
}

function editEvent(id) {
    console.log(arr[id].name);
    let temp = '';
    temp += '<div id="formbox">';
    temp += '    <div id="form">';
    temp += '        <label for="name">Name:</label>';
    temp += '        <input type="text" placeholder="Enter An Event Name Here!" id="name" value=' + JSON.stringify(arr[id].name) + '>';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="date">Date:</label>';
    temp += '        <input type="date" id="date" value=' + JSON.stringify(arr[id].date) + '>';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="time">Time:</label>';
    temp += '        <input type="time" id="time" value=' + JSON.stringify(arr[id].time) + '>';
    temp += '    </div>';
    temp += '    <div id="form">';
    temp += '        <label for="location">Location:</label>';
    temp += '        <input type="text" placeholder="Enter A Location Here!" value=' + JSON.stringify(arr[id].location) + ' id="location">';
    temp += '    </div>';
    temp += '    <div class="button-container" id="form">';
    temp += '        <button onclick="Edit(' + id + ')" style="height:40px">Edit</button>';
    temp += '        <button class="btn-cancel" onclick="cancel()" style="height:40px">Cancel</button>';
    temp += '    </div>';
    temp += '</div>';
    document.getElementById('addItem').innerHTML = temp;
}


function Edit(id) {
    document.getElementById('name').style = "border: 1px solid black";
    document.getElementById('date').style = "border: 1px solid black";
    document.getElementById('time').style = "border: 1px solid black";
    document.getElementById('location').style = "border: 1px solid black"
    const editname = document.getElementById('name').value;
    const editdate = document.getElementById('date').value;
    const edittime = document.getElementById('time').value;
    const editlocation = document.getElementById('location').value;
    if (editname && editdate && edittime && editlocation) {
        document.getElementById('addItem').innerHTML = "";

        arr[id].name = editname;
        arr[id].date = editdate;
        arr[id].time = edittime;
        arr[id].location = editlocation;

        Swal.fire({
            title: "Event Updated !",
            text: "You Can Check Updated Event !",
            icon: "success"
        });

        displayEvent();
    }
    else {
        Swal.fire({
            icon: "error",
            title: "Please Enter A All Field For Better Experience",
            text: "Something went wrong!",
          });
    }
}