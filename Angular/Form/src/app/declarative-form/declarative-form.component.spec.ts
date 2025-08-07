import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeclarativeFormComponent } from './declarative-form.component';

describe('DeclarativeFormComponent', () => {
  let component: DeclarativeFormComponent;
  let fixture: ComponentFixture<DeclarativeFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DeclarativeFormComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DeclarativeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
