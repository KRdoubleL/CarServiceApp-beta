import React from 'react'
import styled from 'styled-components'

const ButtonContent = ({ className }) => {
    return (
        <button className={className} type="submit" value="Submit">
            Find Service
        </button>
    )
}

const Button = styled(ButtonContent)`
    width: 172px;
    margin: 0 auto;
    margin-top: 15px;
    margin-left: 260px;
    padding: 10px 20px;
    font-size: 18px;
    font-weight: 500;
    font-style: normal;
    font-stretch: normal;
    line-height: normal;
    letter-spacing: normal;
    text-align: center;
    color: #ffffff;
    background-color: #ff5252;
    border: none;
    border-radius: 5px;
`

export default Button
