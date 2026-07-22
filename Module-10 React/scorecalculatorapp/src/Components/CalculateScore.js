import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {

    const average = props.Total / props.goal;

    return (
        <div className="box">
            <h2>Student Management Portal</h2>

            <h3>Student Details</h3>

            <p><b>Name:</b> {props.Name}</p>
            <p><b>School:</b> {props.School}</p>
            <p><b>Total Marks:</b> {props.Total}</p>
            <p><b>Number of Subjects:</b> {props.goal}</p>

            <h3>Average Score : {average}</h3>
        </div>
    );
}

export default CalculateScore;