import React, { Component } from "react";

import Button from "@material-ui/core/Button";
import TextField from "@material-ui/core/TextField";
import {bindActionCreators} from "redux";
import * as actionCreators from "../../src/modules/actions/action"
import {connect} from 'react-redux'

class MainPage extends Component {

    handleOnClick() {
        this.props.actions.loadMainPage(this.state.dummyId);
    }

    render() {
        let p = this.props.isMainPageReady ? <p>{this.props.mainPageData.data.dummyTitle}</p> : <p>Not loaded</p>;
        return (
            <section>
                {/*this is for demo only. Do not set state like this, instead use actions*/}
                ID: <TextField size="small" type="number" onChange={(e) => this.setState({...this.state, dummyId: e.target.value})}/>
                <Button onClick={() => this.handleOnClick()}>Input ID and press</Button>
                {p}
            </section>
        );
    }
}

const mapStateToProps = (state) => {
    return {
        mainPageData: state.mainPageData,
        isLoading: state.isLoading,
        isMainPageReady: state.isMainPageReady
    }
};

function mapDispatchToProps(dispatch) {
    return {actions: bindActionCreators(actionCreators, dispatch)}
}

export default connect(mapStateToProps, mapDispatchToProps) (MainPage)