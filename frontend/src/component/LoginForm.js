import React, { useState } from "react";
import { Label, Form, FormGroup, Input, Button } from "reactstrap";
import axios from "axios";

import "../css/LoginForm.css";

const LoginForm = () => {
  const [username, setUsername] = useState(null);
  const [password, setPassword] = useState(null);

  const handleSubmit = (event) => {
    event.preventDefault();
    axios
      .post("https://fungover.org/auth", { username, password })
      .then((response) => {
        console.log(response);
      })
      .catch((error) => {
        console.error(error);
      });
  };

  return (
    <>
    <div className="LoginForm">
      <h2>Log In</h2>
      <Form className="form" onSubmit={handleSubmit}>
        <FormGroup floating>
          <Input
            id="exampleEmail"
            name="email"
            placeholder="Email"
            type="email"
            value={username}
            onChange={(event) => setUsername(event.target.value)}
          />
          <Label for="exampleEmail">Email</Label>
        </FormGroup>
        {" "}
        <FormGroup floating>
          <Input
            id="examplePassword"
            name="password"
            placeholder="password"
            type="password"
            value={password}
            onChange={(event) => setPassword(event.target.value)}
          />
          <Label for="examplePassword">Password</Label>
        </FormGroup>
        <Button type="submit">Submit</Button>
      </Form>
      </div>
    </>
    
  );
};

export default LoginForm;
