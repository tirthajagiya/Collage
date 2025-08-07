class Hotel {
    Hotel_Id: Number;
    Hotel_Name: string;

    constructor(Hotel_Id: Number, Hotel_Name: string) {
        this.Hotel_Id = Hotel_Id;
        this.Hotel_Name = Hotel_Name;
    }

    printHotelname(): void{
        console.log("Hotel Name is : ", this.Hotel_Name);
    }
}

let hotel_1:Hotel=new Hotel(111,"Sayaji");

hotel_1.printHotelname();