import axios from 'axios';

export const START_LOADING_MAIN_PAGE = 'START_LOADING_MAIN_PAGE';
export const FINISHED_LOADING_MAIN_PAGE = 'FINISHED_LOADING_MAIN_PAGE';

export const loadMainPage = (id) => dispatch => {
    console.log("Start")
  dispatch(startLoadingMainPage());

  axios.get("http://localhost:8777/mainPageItems?id=" + id)
      .then(response => {
          console.log(response);
          dispatch(finishLoadingMainPage(response, true))
      })
      .catch(error => {
          console.log(error);
          dispatch(finishLoadingMainPage(error, false))
      })
};

export function startLoadingMainPage() {
    return {
        type: START_LOADING_MAIN_PAGE
    }
}

export function finishLoadingMainPage(response, success) {
    return {
        type: FINISHED_LOADING_MAIN_PAGE,
        isSuccess: success,
        response: response
    }
}