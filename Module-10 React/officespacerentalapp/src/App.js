import './App.css';

function App() {

  const office = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  const officeSpaces = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "Regus",
      Rent: 65000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ margin: "20px" }}>

      <h1>Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=700"
        alt="Office Space"
        width="500"
      />

      <h2>Single Office Details</h2>

      <p><b>Name:</b> {office.Name}</p>

      <p>
        <b>Rent:</b>
        <span
          style={{
            color: office.Rent < 60000 ? "red" : "green"
          }}
        >
          {" "}₹{office.Rent}
        </span>
      </p>

      <p><b>Address:</b> {office.Address}</p>

      <hr />

      <h2>Office Space List</h2>

      {
        officeSpaces.map((item, index) => (

          <div key={index}>

            <p><b>Name:</b> {item.Name}</p>

            <p>
              <b>Rent:</b>
              <span
                style={{
                  color: item.Rent < 60000 ? "red" : "green"
                }}
              >
                {" "}₹{item.Rent}
              </span>
            </p>

            <p><b>Address:</b> {item.Address}</p>

            <hr />

          </div>

        ))
      }

    </div>
  );
}

export default App;