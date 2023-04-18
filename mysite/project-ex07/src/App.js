import React from 'react';
import FoodList from './FoodList';

export default class App extends React.Component {
    render() {
        const message = 'Hello React';
        return (
            <div className='App'>
                <FoodList />
            </div>
        );
    }
}

export { App };