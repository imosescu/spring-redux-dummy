import {FINISHED_LOADING_MAIN_PAGE, START_LOADING_MAIN_PAGE} from '../actions/action';

const initialState = {
    isLoading: false,
    isMainPageReady: false,
    mainPageData: {}
};

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case START_LOADING_MAIN_PAGE:
            //this returns a copy of state, with the mentioned fields changed
            return {...state, isLoading: true, isMainPageReady: false};
        case FINISHED_LOADING_MAIN_PAGE:
            return {...state, isLoading: false, isMainPageReady: true, mainPageData: action.response};
        default:
            console.log("Unknown action type: %s. Returning state.", action.type);
            return state;

    }
};



export default reducer;