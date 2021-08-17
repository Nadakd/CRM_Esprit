import React, { Component } from 'react'
import UniversiteService from '../services/UniversiteService'

 class ListUniversite extends Component {
    constructor(props) {
        super(props)

        this.state = {
            universités: []
        }
        this.addUniversity = this.addUniversity.bind(this);
    }
    componentDidMount(){
        UniversiteService.getUniversite().then((res) => {
            this.setState({ universités: res.data});
        });
     }

     addUniversity(){
        this.props.history.push('/addUniver');
    }
    render() {
        return (
            <div>
               <div className = "row">
                    <button className="btn btn-primary" onClick={this.addUniversity}> Ajouter Université</button>
                 </div>
                 <br></br>
                 <h2 className="text-center">Universitee List</h2> 
                 <div className = "row">
                        <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th> Nom Université</th>
                                    <th> Details</th>
                                  
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.universités.map(
                                        universités => 
                                        <tr key = {universités.iduniver}>
                                             <td> {universités.nom_univer} </td>   
                                             <td> {universités.details}</td>
                                            
                                            
                                        </tr>
                                    )
                                }
                            </tbody>
                            </table>
                            </div>
            </div>
        )
    }
}
export default ListUniversite