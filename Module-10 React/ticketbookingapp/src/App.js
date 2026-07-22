import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

    constructor(props) {
        super(props);

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    logout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        return (
            <div style={{ margin: "20px" }}>

                <h1>Ticket Booking App</h1>

                {
                    this.state.isLoggedIn ? (
                        <div>
                            <button onClick={this.logout}>
                                Logout
                            </button>

                            <UserPage />
                        </div>
                    ) : (
                        <div>
                            <button onClick={this.login}>
                                Login
                            </button>

                            <GuestPage />
                        </div>
                    )
                }

            </div>
        );
    }
}

export default App;