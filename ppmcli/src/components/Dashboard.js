import React from "react";
import { Link } from "react-router-dom";
import ProjectItem from "./ProjectItem";



class Dashboard extends React.Component{
    render(){
        return(
            <div class="projects">
           <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="display-4 text-center">Projects</h1>
                    <br />
                    <Link to="/addproject" class="btn btn-lg btn-info">
                        Create a Project
                    </Link>
                    <br />
                    <hr />
                    <ProjectItem/>
                </div>
            </div>
            </div>   
            </div> 

        );
    }
}
export default Dashboard;