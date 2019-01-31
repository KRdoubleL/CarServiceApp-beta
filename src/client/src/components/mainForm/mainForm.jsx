import React from 'react';
import styled from 'styled-components';
import Button from '../button/button.jsx';
import MountainIcon from '../../img/Mountain_Icon.png';

const MainFormContent = ({ className }) => {
    return (
        <div className={className}>
            <p className='main-form-header'>
                Start Your search
            </p>
            <p className='main-form-paragraph' style={{ width: '550px' }}>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.
            </p>
            <form className='main-form'>
                <div className='input-content'>
                    <label htmlFor={'plz-field'}/>
                    <svg width='20' height='20'>
                        <circle r='8' cx='10' cy='10' fill='transparent' stroke='#ffffff' strokeWidth='3' />
                    </svg>
                    <input className='input-field' id={'plz-field'} placeholder={'Enter your PLZ'}/>
                </div>
                <div className='input-content'>
                    <label htmlFor={'phone-field'}/>
                    <svg width='20' height='20'>
                        <circle r='8' cx='10' cy='10' fill='transparent' stroke='#ffffff' strokeWidth='3' />
                    </svg>
                    <input className='input-field' id={'phone-field'} placeholder={'Enter your phone'}/>
                </div>
                <div className='input-content'>
                    <label htmlFor={'tsn-field'}/>
                    <svg width='20' height='20'>
                        <circle r='8' cx='10' cy='10' fill='transparent' stroke='#ffffff' strokeWidth='3' />
                    </svg>
                    <input className='input-field' id={'tsn-field'} placeholder={'Enter your TSN'}/>
                </div>
                <div className='input-content'>
                    <label htmlFor={'hsn-field'}/>
                    <svg width='20' height='20'>
                        <circle r='8' cx='10' cy='10' fill='transparent' stroke='#ffffff' strokeWidth='3' />
                    </svg>
                    <input className='input-field' id={'hsn-field'} placeholder={'Enter your HSN'}/>
                </div>
                <div className='input-content'>
                    <label htmlFor={'email-field'}/>
                    <svg width='20' height='20'>
                        <circle r='8' cx='10' cy='10' fill='transparent' stroke='#ffffff' strokeWidth='3' />
                    </svg>
                    <input className='input-field' id={'email-field'} placeholder={'Enter your email'}/>
                </div>
                <Button/>
            </form>
        </div>
    );
};

const MainForm = styled(MainFormContent)`
    display: flex;
    flex-direction: column;
    width: 782px;
    padding-bottom: 67px;
    margin: 0 auto;
    color: #ffffff;
    background-image: url(${MountainIcon});
    background-position: 8px 16px;
    background-size: 610px 381px;
    background-repeat: no-repeat;
    
    .main-form-header {
        margin-bottom: 0px;
        font-family: Roboto;
        font-size: 50px;
        font-weight: 500;
        font-style: normal;
        font-stretch: normal;
        line-height: normal;
        letter-spacing: normal;
    }
    
    .main-form-paragraph {
        width: 550px;
    }
    
    .main-form {
        display: flex;
        flex-direction: row;
        flex-wrap: wrap;
        width: 700px;
    }
    
    .input-content {
        width: 210px;
        margin-right: 37px;
        padding-bottom: 15px;
        border-bottom: 1px solid #cecece;
    }
    
    .input-field {
        background-color: #bbbfc4;
        color: #ffffff;
        border: none;
        
            :nth-child(n - 1) {
                margin-top: 25px;
            }
    }
`;

export default MainForm;
