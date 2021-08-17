import React, { Component } from 'react'
import UniversiteService from '../services/UniversiteService';

class CreateUniversite extends Component {
    
    constructor(props) {
        super(props)

        this.state = {
            iduniver: this.props.match.params.id,
            nom_univer:'',
            details:''
        }
        this.changeNameHandler = this.changeNameHandler.bind(this);
        this.changedetailsHandler = this.changedetailsHandler.bind(this);
        this.saveUniversite = this.saveUniversite.bind(this);
    }

    saveUniversite = (e) => {
        e.preventDefault();
        let universités = {nom_univer: this.state.nom_univer, details: this.state.details};
        console.log('universités => ' + JSON.stringify(universités));
        
        UniversiteService.createUniversity(universités).then(res =>{
            this.props.history.push('/listuniver');
        });
    }

    changeNameHandler= (event) => {
        this.setState({nom_univer: event.target.value});
    }
    changedetailsHandler= (event) => {
        this.setState({details: event.target.value});
    }
    cancel(){
        this.props.history.push('/listuniver');
    }

    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                               
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> Nom Université: </label>
                                            <input placeholder="Nom" name="Nom" className="form-control" 
                                                value={this.state.nom_univer} onChange={this.changeNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Details: </label>
                                            <input placeholder="details" name="Details" className="form-control" 
                                                value={this.state.details} onChange={this.changedetailsHandler}/>
                                        </div>
                                       
                                        <button className="btn btn-success" onClick={this.saveUniversite}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }

}
export default CreateUniversite