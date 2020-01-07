import reducer from '../reducers/reducer';
import {createStore, applyMiddleware} from "redux";

import thunk from 'redux-thunk';
import promiseMiddleware from 'redux-promise-middleware';
import logger from 'redux-logger';

const middleWares = [promiseMiddleware, thunk, logger];

const initialState = {
    isLoading: false,
    isMainPageReady: false,
    mainPageData: {}
};

const store = createStore(reducer, initialState, applyMiddleware(...middleWares));

export default store;