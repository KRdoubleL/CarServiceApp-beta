import React from 'react';
import styled from 'styled-components';
import Header from '../header/header.jsx'
import MainForm from '../mainForm/mainForm.jsx'
import Footer from '../footer/footer.jsx'
import Menu from '../menu/menu.jsx'

const MainContent = ({ className }) => {
    return (
        <div className={className}>
            <Header/>
            <MainForm/>
            <Menu/>
            <Footer/>
        </div>
    )
}

const Main = styled(MainContent)`
    display: flex;
    flex-direction: column;
    width: 782px;
    padding: 56px 96px 57px 130px;
    margin: 0 auto;
    background-color: #bbbfc4;
    background-transparent: 0.5;
`

export default Main
