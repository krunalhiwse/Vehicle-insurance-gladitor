import { Component, OnInit } from '@angular/core';
import { Contact } from './contact';
import { ContactService } from './contact.service';


@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  constructor(private ims :ContactService) { }

  ngOnInit(): void {
    
  }
  contact:Contact = new Contact();
  addSuggestions(contactForm:any)
  {
    this.contact=contactForm.value;
    console.log(this.contact);
    this.ims.addSuggestions(this.contact).subscribe
    (
      (data)=>
      {
        console.log(data);
        alert("Thank You for your Suggestion")
      },
      (error)=>
      {
        console.log(error);
        alert("Fill the fields");
      }
    )
  }

}
