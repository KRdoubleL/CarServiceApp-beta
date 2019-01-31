import React from 'react'
import ReactDOM from 'react-dom'
import Main from './components/main/main.jsx'
import styled from 'styled-components'

const Background = styled.div`
height: 100%;
width: 100%;
position: absolute;
top: 0;
left: 0;
background-color: #bbbfc4;
`

const Index = () => {
    return <Background><Main/></Background>
}

ReactDOM.render(<Index/>, document.getElementById('index'))
