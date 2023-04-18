import React from 'react';

import styles from './TaskList';

export default class Task extends React.Component {
    render() {
        return (
            <div className={ styles.Task }>
                <KanbanBoard  cards={ data } />
            </div>
        );
    }
}