import axios from 'axios';

const Universite_API_BASE_URL = "http://localhost:8082/SpringMVC/servlet/findUniversités";

const Universite_API_BASE_URL1 = "http://localhost:8082/SpringMVC/servlet/addUniver";

class UniversiteService {

    getUniversite(){
        return axios.get(Universite_API_BASE_URL);
    }

    createUniversity(universités){
        return axios.post(Universite_API_BASE_URL1,universités);
    }
}
export default new  UniversiteService()