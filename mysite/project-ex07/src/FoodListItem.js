import React from 'react';

export default class FoodListItem extends React.Component {
    render() {
        console.log(this.props);
        return (
        <li>{ this.props.name } : { this.props.quantity }</li>
        );
    }
}