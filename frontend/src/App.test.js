import React from 'react';
import { render, unmountComponentAtNode } from "react-dom";
import { act } from "react-dom/test-utils";
import App from './App';

let container = null;
beforeEach(() => {
  // setup a DOM element as a render target
  container = document.createElement("div");
  document.body.appendChild(container);
});

afterEach(() => {
  // cleanup on exiting
  unmountComponentAtNode(container);
  container.remove();
  container = null;
});

it('renders without crashing', () => {
  // eslint-disable-next-line testing-library/no-unnecessary-act
  act(() => {
    render(<App />, container);
  });
  expect(container).not.toBeNull();
});
