import React, { Fregment, Component} from 'react';

export default class App extends React.Component {
    constructor() {
        super(...arguments);
        this.state = {
            loginInfo: {
                email: '',
                password: ''
            }
        }
    }

    onLoginSubmit(event) {
        event.preventDefault();
        console.log(event.target.email.value + ":" + event.target.password);
    }

    
    render() {
        return (
        <form onSubmit={ this.onLoginSubmit.bind(this)}>
            <div>
                이메일: <input name='email' type='text' />
            </div>
            <br/>
            <div>
                비밀번호: <input type='pasword' />
            </div>
            
            <button type='submit'>로그인</button>
        </form>
        );
    }
}

export { App };