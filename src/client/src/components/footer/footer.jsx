import React from 'react'
import styled from 'styled-components'

const FooterContent = ({ className }) => {
    return (
        <div className={className}>
            <a className='link' href={'#'}>Contacts</a>
            <a className='link' href={'#'}>Faq</a>
            <a className='link' href={'#'}>Datenschutz</a>
        </div>
    )
}

const Footer = styled(FooterContent)`
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    width: 782px;
    padding: 0;
    margin: 0 auto;
    background-color: #bbbfc4;

    .link {
        padding: 0 25px;
        color: #ffffff;
        text-decoration: none;
    }
`

export default Footer
