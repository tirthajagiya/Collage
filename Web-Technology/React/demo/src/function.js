function MyButton() {
  return (
    <>
      This is Button
      <br />
      <button className="myBtn">Add</button>
    </>
  );
}

const user={
    name:"arjun",
    spi:10,
    image:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQp-GAo-zkkzro7wj4k2WDPR65z4GAcFtC1iA&s",
    isAdmin:true
}

const products = [
    { title: 'Cabbage', id: 1 },
    { title: 'Garlic', id: 2 },
    { title: 'Apple', id: 3 },
  ];

const formatedProducts = products.map(pro=>{
    <li>
        {pro.title}
    </li>
});

function MyCard() {
    return(
        <>
           <ul>{formatedProducts}</ul>
        </>
    );
}

export { MyButton , MyCard};