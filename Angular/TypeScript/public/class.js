"use strict";
class Hotel {
    constructor(Hotel_Id, Hotel_Name) {
        this.Hotel_Id = Hotel_Id;
        this.Hotel_Name = Hotel_Name;
    }
    printHotelname() {
        console.log("Hotel Name is : ", this.Hotel_Name);
    }
}
let hotel_1 = new Hotel(111, "Sayaji");
hotel_1.printHotelname();
