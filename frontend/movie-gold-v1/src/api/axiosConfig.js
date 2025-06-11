import axios from "axios";
export default axios.create({
    //resources fetching
    baseURL:"http://localhost:8080",
   // headers:{"ngrok-skip-browser-warning":"true"}
})