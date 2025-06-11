import React from 'react';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faVideoSlash } from '@fortawesome/free-solid-svg-icons';
import { Button } from 'bootstrap';
import Container, { Navbar, NavDropdown } from 'react-bootstrap';
import { Nav } from 'react-bootstrap';
import NavLink from 'react-bootstrap';
const Header = () => {
  return (
    <Navbar bg="dark" variant = "dark" expand = "lg">
    <Container fluid>
        <Navbar.Brand href="/" style={{"color" :"silver"}}><FontAwesomeIcon icon={faVideoSlash}/></Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarScroll" />
            <Navbar.Collapse id="navbarScroll">
                <Nav className="me-auto my-2 my-lg-0"
                    style={{maxHeight :"100px"}}     
                navbarScroll>
                    <NavLink className="nav-link" to="/" style={{"color" :"silver"}}>Home</NavLink>
                     <NavLink className="nav-link" to="/watchList" style={{"color" :"silver"}}>Watch List</NavLink>
                </Nav>
                <Button variant="outline-info" className="me-2" style={{"color" :"silver"}}>Login</Button>
                <Button variant="outline-info" className="me-2" style={{"color" :"silver"}}>Register</Button>
            </Navbar.Collapse>
       
    </Container>
      
    </Navbar>
  );
}

export default Header;
