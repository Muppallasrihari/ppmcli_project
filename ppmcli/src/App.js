import logo from './logo.svg';
import './App.css';

import HeaderComponent from './components/HeaderComponent';                                                                
import Dashboard from './components/Dashboard';
import ProjectItem from './components/ProjectItem';
import { BrowserRouter as Router,Route } from 'react-router-dom';
import CreateProjectButton from './components/projects/CreateProjectButton';
import AddProject from './components/projects/AddProject';


function App() {
  return (
    <Router>
    <div >
      <HeaderComponent/>
      <Route exact path="/dashboard" component={Dashboard}/>
      <Route exact path="/addproject" component={AddProject}/>

    </div>  
    </Router>  
  );
}

export default App;
