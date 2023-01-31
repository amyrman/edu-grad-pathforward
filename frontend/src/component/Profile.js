import axios from "axios";
import React from "react";

import "../css/Profile.css";

function Profile () {
  
  const baseURL = "http://localhost:8080/users/1";
  const [post, setPost] = React.useState();

  React.useEffect(() => {
    axios.
      get(baseURL, {
        headers: {"Authorization": "Bearer eyJraWQiOiIxIiwiYWxnIjoiRVMyNTYifQ.eyJzdWIiOiJ0ZXN0QHRlc3QubnUiLCJpc3MiOiJodHRwczovL2Z1bmdvdmVyLm9yZy9hdXRoIiwiaWF0IjoxNjc1MTU5NjMwLCJleHAiOjE2NzUxNjA1MzAsImF1ZCI6Imh0dHBzOi8vZnVuZ292ZXIub3JnIiwic2NvcGUiOiJyZWFkIHdyaXRlIiwicm9sZXMiOlsicmVhZCIsIndyaXRlIl0sInZlaGljbGVzIjpbIjEiLCIyIl19.VccZ168x2DfFW7fPAXZIk7K7y1Z20OOq6Hs2bm_uRshjUvWGFkmIZE7_yfXI6IkGNR6U2KjTAXyv3THKQIQGww"}})
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
