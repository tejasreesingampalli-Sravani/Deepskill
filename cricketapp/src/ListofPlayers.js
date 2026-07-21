import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 68 },
        { name: "Rahul", score: 74 },
        { name: "Pant", score: 65 },
        { name: "Hardik", score: 80 },
        { name: "Jadeja", score: 58 },
        { name: "Ashwin", score: 77 },
        { name: "Shami", score: 60 },
        { name: "Bumrah", score: 85 },
        { name: "Siraj", score: 72 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            {players.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}

            <h2>Players with Score Below 70</h2>

            {below70.map((player, index) => (
                <p key={index}>
                    {player.name} - {player.score}
                </p>
            ))}
        </div>
    );
}

export default ListofPlayers;