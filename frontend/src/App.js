import React, { Component } from 'react';
import LoginForm from './component/LoginForm.js';

class App extends Component {
  render() {
    return (
      <div className="App">
        <LoginForm />
      </div>
    );
  }
}

export default App;

// import axios from "axios";
// import React from "react";
// import './App.css';

// const baseURL = "http://localhost:8080/users/1";

// function App() {
//   const [post, setPost] = React.useState(null);

//   React.useEffect(() => {
//     axios.get(baseURL, {
//       headers: {
//         "Authorization": "Bearer eyJraWQiOiIxIiwiYWxnIjoiRVMyNTYifQ.eyJzdWIiOiJ0ZXN0QHRlc3QubnUiLCJpc3MiOiJodHRwczovL2Z1bmdvdmVyLm9yZy9hdXRoIiwiaWF0IjoxNjc1MDc5NDA0LCJleHAiOjE2NzUwODAzMDQsImF1ZCI6Imh0dHBzOi8vZnVuZ292ZXIub3JnIiwic2NvcGUiOiJyZWFkIHdyaXRlIiwicm9sZXMiOlsicmVhZCIsIndyaXRlIl0sInZlaGljbGVzIjpbIjEiLCIyIl19.zLnVFXclqvQrgiqzc1xRCLVWvGeTm0hNXQ6OxQYqC8GlK1K6vqfvO-eoMqrjiDsmdMaX6Wjym2I4M4Bd7NXmMg"}}).then((response) => {
//       setPost(response.data);
//     });
//   }, []);

//   if (!post) return null;

//   return (
//     <div>
//       <h1>{post.name}</h1>
//       <p>{post.email}</p>
//     </div>
//   );
