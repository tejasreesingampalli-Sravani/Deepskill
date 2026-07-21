import React from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

    let bookComponent = null;

    // Method 1: if statement
    if (showBooks) {
        bookComponent = <BookDetails />;
    }

    return (
        <div style={{ margin: "20px" }}>

            <h1>Blogger App</h1>

            {bookComponent}

            {/* Method 2: Logical && */}
            {showBlogs && <BlogDetails />}

            {/* Method 3: Ternary Operator */}
            {showCourses ? <CourseDetails /> : <h3>No Courses Available</h3>}

        </div>
    );
}

export default App;