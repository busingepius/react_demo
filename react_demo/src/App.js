import './App.css';
import data from "./data.js"
import {useState} from "react";
import Post from "./Post";


function Postt(props) {
    const [post, setState] = useState(new Post(1, "MIU", "Dean"));

    return <div className="post">
        <h1> Id: {props.id}</h1>
        <h1>Title: {props.title}</h1>
        <h1>Author: {props.author}</h1>
    </div>
}

function PopulatePost() {
    return data.map((e) =>
        <Postt
            id={e.id}
            title={e.title}
            author={e.author}
            key={e.id}
        />
    );
}

function textField() {
    return <div>
        <input type="text" className="textInput"/>
        <button> Change Name</button>
    </div>
}

function Boarder() {
    const [post, setState] = useState(new Post(1, "MIU", "Dean"));

    return <div className="border">
        <h1>{post.title}</h1>
        <h1>{post.author}</h1>
        <h1 className="content">This is the content in the post....</h1>
        <div className="text_button">
            <h3>edit</h3>
            <h3>delete</h3>
        </div>
    </div>
}


function App() {

    return <section>
        <div className="post-container">{PopulatePost()}</div>
        {textField()}
        {Boarder()}
    </section>;
}

export default App;
