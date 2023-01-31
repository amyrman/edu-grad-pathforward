import axios from "axios";
import React from "react";

import "../css/Profile.css";

function Profile () {
  
  const baseURL = "http://localhost:8080/users/1";
  const [post, setPost] = React.useState();

  React.useEffect(() => {
    axios
      .get(baseURL, {
        headers: {"Authorization": "Bearer [AUTH TOKEN]"}})
        .then((response) => {setPost(response.data);
    });
  }, []);

  if (!post) return null;

  return (

    <div className="Profile">
      <h1>{post.name}</h1>
      <p>{post.email}</p>
    </div>
  
  )
 
};

export default Profile;
