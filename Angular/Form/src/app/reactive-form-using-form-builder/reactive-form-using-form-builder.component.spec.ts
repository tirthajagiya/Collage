import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveFormUsingFormBuilderComponent } from './reactive-form-using-form-builder.component';

describe('ReactiveFormUsingFormBuilderComponent', () => {
  let component: ReactiveFormUsingFormBuilderComponent;
  let fixture: ComponentFixture<ReactiveFormUsingFormBuilderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ReactiveFormUsingFormBuilderComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ReactiveFormUsingFormBuilderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
