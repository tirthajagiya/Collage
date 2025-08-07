import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from "./navbar/navbar.component";
import { ContactComponent } from "./contact/contact.component";
import { FooterComponent } from "./footer/footer.component";
import { SkillComponent } from "./skill/skill.component";
import { ProjectComponent } from "./project/project.component";
import { AboutComponent } from "./about/about.component";
import { HomeComponent } from "./home/home.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, NavbarComponent, ContactComponent, FooterComponent, SkillComponent, ProjectComponent, AboutComponent, HomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Portfolio';
}
