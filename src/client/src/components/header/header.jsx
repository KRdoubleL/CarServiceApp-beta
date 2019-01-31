import React from 'react'
import styled from 'styled-components'

const HeaderContent = ({ className }) => {
    return (
        <div className={className}></div>
    )
}

const Header = styled(HeaderContent)`
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    width: 100%;
    padding: 0;
    margin: 0 auto;
    background-color: #bbbfc4;
`

export default Header
