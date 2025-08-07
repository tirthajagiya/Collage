import { NgClass, NgFor, NgIf, NgStyle, NgSwitch, NgSwitchCase, NgSwitchDefault } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,NgIf,NgFor,FormsModule,NgSwitch,NgSwitchCase,NgSwitchDefault,NgStyle,NgClass],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Directive';
  bol:boolean=true
  stu_mark=[10,20,30]
  day=""

  myColor={
    "background-color":"red",
    "font-size":"50px"
  }

  otherColor={
    
  }
}
