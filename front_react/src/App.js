import logo from './logo.svg';
import './App.css';
import ListUniversite from './components/ListUniversite';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import CreateUniversite from './components/CreateUniversite';

function App() {
  return (
    <div>
      <Router>
       
        
    <div className="container">
      <switch>
      <Route path = "/" exact component = {ListUniversite}></Route>
      <Route path = "/listuniver"  component = {ListUniversite}></Route>
       <Route path = "/addUniver"  component = {CreateUniversite}></Route>
     
       {/*/*<ListUniversite/>*/}
     </switch>
    </div>
   
    </Router>
    </div>
  );
}

export default App;
